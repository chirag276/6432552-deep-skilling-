#!/bin/bash
# Git Merge Conflict Resolution Hands-on Lab

echo "=== Step 1: Verify master is in a clean state ==="
git checkout master
git status

echo "=== Step 2: Create branch 'GitWork' and switch to it ==="
git checkout -b GitWork

echo "=== Step 3: Add hello.xml to GitWork branch ==="
echo "<message>Hello from GitWork branch</message>" > hello.xml

echo "=== Step 4: Stage and commit hello.xml in GitWork ==="
git add hello.xml
git commit -m "Added hello.xml in GitWork branch"

echo "=== Step 5: Switch to master branch ==="
git checkout master

echo "=== Step 6: Add hello.xml to master with DIFFERENT content ==="
echo "<message>Hello from master branch</message>" > hello.xml

echo "=== Step 7: Stage and commit hello.xml in master ==="
git add hello.xml
git commit -m "Added hello.xml in master branch with different content"

echo "=== Step 8: View commit history (all branches) ==="
git log --oneline --graph --decorate --all

echo "=== Step 9: Show CLI differences between master and GitWork ==="
git diff master GitWork

echo "=== Step 10: Show visual differences using P4Merge tool (if configured) ==="
git difftool --tool=p4merge master GitWork

echo "=== Step 11: Merge GitWork into master (will cause conflict) ==="
git merge GitWork

echo "=== Step 12: Observe Git conflict markers in hello.xml ==="
echo "Open hello.xml to see >>>>>> HEAD, =======, <<<<<< markers."

echo "=== Step 13: Use 3-way merge tool to resolve conflict ==="
git mergetool --tool=p4merge

echo "=== Step 14: Stage resolved file and commit merge ==="
git add hello.xml
git commit -m "Merge branch 'GitWork' into master - conflict resolved"

echo "=== Step 15: Check git status after merge ==="
git status

echo "=== Step 16: Add backup files from merge tool to .gitignore ==="
echo "*.orig" >> .gitignore
git add .gitignore
git commit -m "Added merge backup files to .gitignore"

echo "=== Step 17: List all branches ==="
git branch -a

echo "=== Step 18: Delete GitWork branch after merge ==="
git branch -d GitWork

echo "=== Step 19: Show updated commit history ==="
git log --oneline --graph --decorate

echo "=== DONE! Merge conflict resolved successfully. ==="
