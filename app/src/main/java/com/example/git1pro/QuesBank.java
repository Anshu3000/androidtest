package com.example.git1pro;

public class QuesBank {
    private  String ques;
    private  boolean ans;

    public QuesBank(String ques, boolean ans) {
        this.ques = ques;
        this.ans = ans;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public void setAns(boolean ans) {
        this.ans = ans;
    }

    public String getQues() {
        return ques;
    }

    public boolean isAns() {
        return ans;
    }

}
