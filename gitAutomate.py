from git import repo
import os
from git import repo
Current_Dir=os.getcwd()
reps=repo.Repo(path=Current_Dir)
untrack=reps.untracked_files
for i in untrack:
    reps.index.add(i)
    commit_msg="Leetcode "+i.split(".")[0].split("_").pop()
    reps.index.commit(message=commit_msg)
    
# rep=cmd.Git(Current_Dir)
# print(rep.execute(command=["git","status"],stdout_as_string=True).split(""))


