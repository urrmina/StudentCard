# StudentCard
Une application pour la création d’une carte d’étudiant conçue et développée en Java.

THE STEPS OF MAKING THE PROJECT AND CONNECTING IT WITH A GITHUB REPOSITORY: 
1st: I initialized my project with the command "git init"
2nd: I created three files to write code in
3rd: created repository in GitHub. Added all files with the "git add ." command
4th: put my files in a committed state (Ready to be pushed to the remote repo on GitHub) with the command "git commit -m "first commit" "
5th: Connect my local repo and the remote repo in GitHub with the command: "git remote add origin https://github.com/ihechikara/git-and-github-tutorial.git"
6th: "git branch -M main" to change the main branch name to 'main'
7th: tried command: "git push -u origin main" to push repo device to GitHub but got rejected    error: failed to push some refs to 'https://github.com/urrmina/StudentCard.git'
8th: to fix it used three commands: "git pull -u origin main" ---> "git push -u origin main" ---> another error: failed to push some refs to 'https://github.com/urrmina/StudentCard.git' ---> "git push -f origin main" :: last command used to force changes to the server with the local repository.
FINAL
