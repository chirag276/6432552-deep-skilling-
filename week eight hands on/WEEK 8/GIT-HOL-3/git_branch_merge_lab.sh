#!/bin/bash
# Git Branching and Merging Hands-on Lab

echo "=== Step 1: Verify Git installation ==="
git --version

echo "=== Step 2: Navigate to your existing Git repository ==="
# Replace with your repository path if needed
cd GitDemo || exit

echo "=== Step 3: Create a new branch 'GitNewBranch' ==="
git branch GitNewBranch

echo "=== Step 4: List all local and remote branches ==="
git branch -a

echo "=== Step 5: Switch to the new branch ==="
git checkout GitNewBranch

echo "=== Step 6: Add files to the branch ==="
echo "This file is in GitNewBranch" > branchfile.txt

echo "=== Step 7: Stage and commit changes in the branch ==="
git add branchfile.txt
git commit -m "Added branchfile.txt in GitNewBranch"

echo "=== Step 8: Check branch status ==="
git status

echo "=== Step 9: Switch to master branch ==="
git checkout master

echo "=== Step 10: Show differences between master and GitNewBranch (CLI) ==="
git diff master GitNewBranch

echo "=== Step 11: Show visual differences using P4Merge tool ==="
# Ensure P4Merge is configured in your system before running
git mergetool --tool=p4merge

echo "=== Step 12: Merge GitNewBranch into master ==="
git merge GitNewBranch

echo "=== Step 13: Show merge history in one-line graph ==="
git log --oneline --graph --decorate

echo "=== Step 14: Delete the branch after merging ==="
git branch -d GitNewBranch

echo "=== Step 15: Final git status ==="
git status

echo "=== DONE! Branching and merging completed successfully. ==="
