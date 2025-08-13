# Git Ignore Hands-on Lab

## Overview
This lab demonstrates how to use `.gitignore` to prevent unwanted files and folders from being tracked by Git.

## Objectives
- Explain `.gitignore`
- Ignore unwanted files (e.g., `.log` files) and folders (e.g., `logs/`)

## Steps Covered
1. Create `.log` file and `logs` folder
2. Add ignore rules to `.gitignore`
3. Commit `.gitignore` to the repository
4. Verify ignored files are not staged

## Prerequisites
- Git environment setup
- Notepad++ integrated as default editor
- Local and remote Git repository ready

## How to Run
1. Navigate to your local Git repository folder.
2. Place `git_ignore_lab.sh` in that folder.
3. Run:
```bash
sh git_ignore_lab.sh
```
4. Check that `.log` files and `logs/` folder are ignored in `git status`.
