# Git Hands-On Lab 2 – Git Ignore

## Name

**Avni Sharma**

## Objective

* Explain Git Ignore.
* Learn how to ignore unwanted files and folders using `.gitignore`.
* Verify ignored files using `git status`.

---

## Step 1: Create a `.log` File and `log` Folder

Created a `.log` file (`sample.log`) and a folder named `log`.

### Commands Executed

```powershell
echo This is a log file > sample.log
mkdir log
echo Error > log\error.txt
```

### Screenshot

![Step 1](step1.png)

---

## Step 2: Create the `.gitignore` File

Created a `.gitignore` file with the following content:

```text
*.log
log/
```

This tells Git to ignore:

* All files ending with `.log`
* Any folder named `log`

### Screenshot

![Step 2](step2.png)

---

## Step 3: Verify Ignored Files

Command executed:

```powershell
git status
```

Git successfully ignored `sample.log` and the `log` folder.

### Screenshot

![Step 3](step3.png)

---

## Step 4: Commit the Changes

Commands executed:

```powershell
git add Git/Exercise-2-Git-Ignore
git commit -m "Added Exercise 2 - Git Ignore"
```

### Screenshot

![Step 4](step4.png)

---

## Step 5: Push to GitHub

Command executed:

```powershell
git push origin main
```

### Screenshot

![Step 5](step5.png)

---

## Result

The `.gitignore` file successfully ignored:

* `*.log`
* `log/`

The ignored files did not appear in Git tracking, confirming that the ignore rules worked correctly.

---

## Conclusion

This hands-on exercise demonstrated how to use the `.gitignore` file to prevent unnecessary files and folders from being tracked by Git. Using `.gitignore` helps keep repositories clean and avoids committing unwanted or temporary files.
