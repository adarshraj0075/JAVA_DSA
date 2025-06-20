public class RecurMazeStorPath {
    public static void main(String args[]){
        printPath("", 3, 3);

    }
    static void printPath(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
       
        if(r>1){
            printPath(p+"d", r-1, c); 
        }
        if(c>1){
            printPath(p+"r",r,c-1);
        }
    }
    
}

// git command
//git -v
//git clone "url of repo"
//gui(Graphic user interface)& cli(command line interface)
//cli command
//ls , cd-->inward ,outwnward, mkdir
// git add 
// git commit -m ""
//git push

//colabaration using git hub
// to create branch
//git branch --list (list all the branches)
//git branch BranchName(creates the branch)
//git checkout BranchName (move to other branch)
