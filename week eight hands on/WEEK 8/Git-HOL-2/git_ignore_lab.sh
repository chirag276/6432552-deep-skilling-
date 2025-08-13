#!/bin/bash
# Git Ignore Hands-on Lab

echo "=== Step 1: Verify Git installation ==="
git --version

echo "=== Step 2: Navigate to your existing Git repository ==="
# Replace with your repository path if needed
cd GitDemo || exit

echo "=== Step 3: Create .log file and log folder ==="
echo "This is a log file" > debug.log
mkdir logs
echo "Another log file" > logs/system.log

echo "=== Step 4: Create or edit .gitignore file ==="
echo "*.log" > .gitignore
echo "logs/" >> .gitignore

echo "=== Step 5: Display .gitignore contents ==="
cat .gitignore

echo "=== Step 6: Check git status before staging ==="
git status

echo "=== Step 7: Stage and commit changes ==="
git add .gitignore
git commit -m "Added .gitignore to ignore .log files and logs folder"

echo "=== Step 8: Verify ignored files are not staged ==="
git status

echo "=== Step 9: Push changes to remote ==="
git push origin master

echo "=== DONE! .log files and logs folder are now ignored by Git. ==="
