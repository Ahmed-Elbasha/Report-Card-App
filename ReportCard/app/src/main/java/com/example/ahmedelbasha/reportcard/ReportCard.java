package com.example.ahmedelbasha.reportcard;

public class ReportCard {

    // The States of the ReportCard Class
    private String mStudentName;
    private String mStudentClass;
    private String mEnglishGrade;
    private String mMathGrade;
    private String mHistoryGrade;
    private String mBiologyGrade;
    private String mComputerScienceGrade;
    private String mFinalGrade;

    /**
     * The constructor of the ReportCard class.
     *
     * @param studentName name of the student.
     * @param studentClass class of the student.
     * @param englishGrade English grade.
     * @param mathGrade Math grade.
     * @param historyGrade History grade.
     * @param biologyGrade Biology grade.
     * @param computerScienceGrade computerScience grade.
     * @param finalGrade Final grade.
     * */
    public ReportCard (String studentName, String studentClass, String englishGrade, String mathGrade, String historyGrade
                       ,String biologyGrade, String computerScienceGrade, String finalGrade) {
        mStudentName = studentName;
        mStudentClass = studentClass;
        mEnglishGrade = englishGrade;
        mMathGrade = mathGrade;
        mHistoryGrade = historyGrade;
        mBiologyGrade = biologyGrade;
        mComputerScienceGrade = computerScienceGrade;
        mFinalGrade = finalGrade;
    }


    public void setmStudentName(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    public String getmStudentName() {
        return mStudentName;
    }

    public void setmStudentClass(String mStudentClass) {
        this.mStudentClass = mStudentClass;
    }

    public String getmStudentClass() {
        return mStudentClass;
    }

    public void setmEnglishGrade(String mEnglishGrade) {
        this.mEnglishGrade = mEnglishGrade;
    }

    public String getmEnglishGrade() {
        return mEnglishGrade;
    }

    public void setmMathGrade(String mMathGrade) {
        this.mMathGrade = mMathGrade;
    }

    public String getmMathGrade() {
        return mMathGrade;
    }

    public void setmHistoryGrade(String mHistoryGrade) {
        this.mHistoryGrade = mHistoryGrade;
    }

    public String getmHistoryGrade() {
        return mHistoryGrade;
    }

    public void setmBiologyGrade(String mBiologyGrade) {
        this.mBiologyGrade = mBiologyGrade;
    }

    public String getmBiologyGrade() {
        return mBiologyGrade;
    }

    public void setmComputerScienceGrade(String mComputerScienceGrade) {
        this.mComputerScienceGrade = mComputerScienceGrade;
    }

    public String getmComputerScienceGrade() {
        return mComputerScienceGrade;
    }

    public void setmFinalGrade(String mFinalGrade) {
        this.mFinalGrade = mFinalGrade;
    }

    public String getmFinalGrade() {
        return mFinalGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mStudentName='" + mStudentName + '\'' +
                ", mStudentClass='" + mStudentClass + '\'' +
                ", mEnglishGrade='" + mEnglishGrade + '\'' +
                ", mMathGrade='" + mMathGrade + '\'' +
                ", mHistoryGrade='" + mHistoryGrade + '\'' +
                ", mBiologyGrade='" + mBiologyGrade + '\'' +
                ", mComputerScienceGrade='" + mComputerScienceGrade + '\'' +
                ", mFinalGrade='" + mFinalGrade + '\'' +
                '}';
    }
}
