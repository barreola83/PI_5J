package classes;

import java.util.Date;

public class TicketEvaluation {

    //La tabla Ticket_Evaluation en la BD tiene el siguiente formato:
    //| no_evaluacion       | int(5)      | NO   | PRI | NULL    |       |
    //| respuesta_preguntas | varchar(80) | NO   |     | NULL    |       |
    //| fecha               | datetime    | NO   |     | NULL    |       |
    
    private int evaluationNum;
    private String answer; //en el diagrama está como respuesta_preguntas
    private Date date;

    public TicketEvaluation(int evaluationNum, String answer, Date date) {
        this.evaluationNum = evaluationNum;
        this.answer = answer;
        this.date = date;
    }

    public int getEvaluationNum() {
        return evaluationNum;
    }

    public String getAnswer() {
        return answer;
    }

    public Date getDate() {
        return date;
    }

    public void setEvaluationNum(int evaluationNum) {
        this.evaluationNum = evaluationNum;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
