# Git Branching and Merging Hands-on Lab

## Overview
This lab demonstrates creating a branch, making changes in it, and merging it with the master branch. It also covers visual merge using P4Merge.

## Objectives
- Explain branching and merging
- Create a branch request in GitLab
- Create a merge request in GitLab

## Steps Covered
### Branching
1. Create a new branch `GitNewBranch`
2. List local and remote branches
3. Switch to the new branch
4. Add files and commit changes
5. Check branch status

### Merging
1. Switch to `master`
2. Show CLI differences between `master` and branch
3. Show visual differences using P4Merge
4. Merge the branch into master
5. View merge history with `git log --oneline --graph --decorate`
6. Delete the branch and check status

## Prerequisites
- Git environment setup
- P4Merge tool configured in Git
- Local Git repository and remote GitLab repository

## How to Run
1. Place `git_branch_merge_lab.sh` inside your Git repository folder.
2. Make the script executable:
```bash
chmod +x git_branch_merge_lab.sh
