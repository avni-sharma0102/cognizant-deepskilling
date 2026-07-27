# Git Hands-On Lab 2 – Git Ignore

## Name

Avni Sharma

## Objective

* Understand the purpose of the `.gitignore` file.
* Learn how to ignore unwanted files and folders in Git.
* Verify ignored files using `git status`.

---

# Step 1: Create a `.log` file and `log` folder

### Commands Executed

```powershell
echo This is a log file > sample.log
mkdir log
echo Error > log\error.txt
```

### Screenshot

**Step1.png**

---

# Step 2: Create the `.gitignore` file

Created a `.gitignore` file with the following content:

```text
*.log
log/
```

This tells Git to ignore:

* All files ending with `.log`
* Any folder named `log`

### Screenshot

**Step2.png**

---

# Step 3: Verify Ignored Files

### Command Executed

```powershell
git status
```

The `sample.log` file and the `log` folder were ignored by Git. Only the required files were available for tracking.

### Screenshot

**Step3.png**

---

# Step 4: Commit the Changes

### Commands Executed

```powershell
git add Git/Exercise-2-Git-Ignore
git commit -m "Added Exercise 2 - Git Ignore"
```

### Screenshot

**Step4.png**

---

# Step 5: Push to GitHub

### Command Executed

```powershell
git push origin main
```

The repository was successfully updated on GitHub.

### Screenshot

**Step5.png**

---

# Result

The `.gitignore` file successfully ignored:

* `*.log`
* `log/`

The ignored files did not appear in Git tracking, confirming that the ignore rules were applied successfully.

---

# Conclusion

This hands-on exercise demonstrated how to use the `.gitignore` file to prevent unnecessary files and folders from being tracked by Git. Using `.gitignore` helps keep repositories clean and avoids committing temporary or unwanted files.
