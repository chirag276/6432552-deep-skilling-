#!/bin/bash
# Git Hands-on Lab: GitDemo

echo "=== Step 1: Check Git installation ==="
git --version

echo "=== Step 1.1: Configure Git User ==="
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"

echo "=== Step 1.2: Verify configuration ==="
git config --list

echo "=== Step 2: Setting Notepad++ as Git default editor ==="
# Update the path below if Notepad++ is in a different location
EDITOR_PATH="/c/Program Files/Notepad++/notepad++.exe"
git config --global core.editor "\"$EDITOR_PATH\" -multiInst -nosession"

echo "=== Step 2.1: Verify default editor ==="
git config --global -e  # Will open Notepad++ to check

echo "=== Step 3: Create GitDemo project locally ==="
mkdir GitDemo
cd GitDemo
git init

echo "=== Step 3.1: Verify .git folder exists ==="
ls -a

echo "=== Step 3.2: Create welcome.txt ==="
echo "Welcome to Git Hands-on Lab" > welcome.txt

echo "=== Step 3.3: Verify file exists ==="
ls
echo "=== Step 3.4: Display file content ==="
cat welcome.txt

echo "=== Step 3.5: Check status ==="
git status

echo "=== Step 3.6: Stage the file ==="
git add welcome.txt
git status

echo "=== Step 3.7: Commit the file ==="
git commit -m "Initial commit: Added welcome.txt"

echo "=== Step 4: Connect to remote GitLab repository ==="
# Replace with your GitLab repo URL
git remote add origin https://gitlab.com/yourusername/GitDemo.git

echo "=== Step 4.1: Pull remote (in case of changes) ==="
git pull origin master --allow-unrelated-histories

echo "=== Step 4.2: Push local to remote ==="
git push origin master

echo "=== DONE! Your file is now in GitLab repository. ==="
