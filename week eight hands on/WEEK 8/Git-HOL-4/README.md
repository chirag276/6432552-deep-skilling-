# Git Merge Conflict Resolution Hands-on Lab

## Overview
This lab demonstrates how to create and resolve a merge conflict in Git using both the CLI and P4Merge visual tool.

## Objectives
- Explain how to resolve conflicts during merge
- Practice a 3-way merge with P4Merge
- Update `.gitignore` to exclude merge backup files

## Steps Covered
1. Verify master is in clean state
2. Create a new branch `GitWork`
3. Add `hello.xml` with content in the branch
4. Commit changes in branch
5. Switch to `master` branch
6. Add `hello.xml` with different content
7. Commit changes in master
8. View commit history for both branches
9. Show CLI differences
10. Show visual differences in P4Merge
11. Merge `GitWork` into `master` (causing conflict)
12. Observe Git conflict markers in file
13. Resolve conflict using 3-way merge in P4Merge
14. Commit resolved merge
15. Add backup files to `.gitignore`
16. Commit `.gitignore`
17. Delete merged branch
18. View updated commit history

## Prerequisites
- Git environment setup
- P4Merge tool installed and configured in Git:
```bash
git config --global merge.tool p4merge
git config --global mergetool.keepBackup false
