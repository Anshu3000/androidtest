package com.example.git1pro;

public class QuesBank {
    private  int ques;
    private  boolean ans;

    public QuesBank(int ques, boolean ans) {
        this.ques = ques;
        this.ans = ans;
    }

    public void setQues(int ques) {
        this.ques = ques;
    }

    public void setAns(boolean ans) {
        this.ans = ans;
    }

    public int getQues() {
        return ques;
    }

    public boolean isAns() {
        return ans;
    }

}
