This project for Java Practices include Java 7,8,9,10,11.. and for Design pattern and Data structure 

Github first time 

** When you have project and not sync with any git and you want to add to github
   Then STEPS:

1> crete repository to git hub..
2> come to project and execute following command

        git init
        git add -A
        git commit -m ""
        git remote add origin <URL of newly created repo on 1st step> //this step add origin to your project which is remote location of repo.
        check for remote by --> git remote -v
        git push -f -u origin master // master is nothing but the branch name ib =n this case my branch name is master so like that else your branch name will be vary

        ...so finally your projecr is on git hub

** Create new branch
  As per project we have only one branch 'master' (currently is our base branch).So we will create new branch as name feature/java-design-pattern

            $ git checkout -b feature/java-desgin-pattern       --> create and Switched to a new branch 'feature/java-desgin-pattern'

  Now it is on local we need to push it to remote 

            git push remote feature/java-design-pattern



