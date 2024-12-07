#!/bin/bash

# Store the project root directory
PROJECT_ROOT="/home/aliabbaschadhar/Desktop/Programming/Data-Structure---Algo-in-java"

# Function to compile and run a Java file
compile_and_run() {
    local file="$1"
    echo "Compiling: $file"
    
    # Get the package name from the file
    package_name=$(grep -o "package.*;" "$file" | cut -d' ' -f2 | tr -d ';')
    
    # Get the class name from the file name
    class_name=$(basename "$file" .java)
    
    # Compile the file
    if javac "$file"; then
        echo "Running: $package_name.$class_name"
        java "$package_name.$class_name"
    else
        echo "Compilation failed for: $file"
    fi
}

# Find and compile all Java files
find "$PROJECT_ROOT" -name "*.java" | while read -r file; do
    compile_and_run "$file"
done

# Clean up all .class files recursively
echo -e "\nCleaning up .class files..."
find "$PROJECT_ROOT" -name "*.class" -type f -delete
echo "Cleanup complete!"
