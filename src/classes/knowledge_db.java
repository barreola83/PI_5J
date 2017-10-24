package classes;

public class knowledge_db {

    private String problem;
    private String solution;
    private int no_problem;

    public knowledge_db(String problem, String solution, int no_problem) {
        this.problem = problem;
        this.solution = solution;
        this.no_problem = no_problem;
    }
    
    public String getProblem() {
        return problem;
    }

    public String getSolution() {
        return solution;
    }

    public int getNo_problem() {
        return no_problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public void setNo_problem(int no_problem) {
        this.no_problem = no_problem;
    }
}
