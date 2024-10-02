package com.ohgiraffers.section01.EmployeeDTO;

public class DTO {

        private int EMP_ID; // 사원번호
        private String EMP_NAME; // 직원명
        private int EMP_NO; // 주민등록번호
        private String EMAIL; // 이메일
        private int PHONE; // 휴대전화
        private String DEPT_CODE; // 부서코드
        private String JOB_CODE; // 직급코드
        private String SAL_LEVEL; // 급여등금
        private int SALARY; // 급여
        private double BONUS; // 보너스율
        private int MANAGER_ID; // 관리자사번
        private String HIRE_DATE; // 입사일
        private String ENT_DATE; // 퇴사일
        private String ENT_YN; // 퇴직여부

        public DTO() {}

        public DTO(int EMP_ID, String EMP_NAME, int EMP_NO, String EMAIL, int PHONE, String DEPT_CODE, String JOB_CODE, String SAL_LEVEL, int SALARY, double BONUS, int MANAGER_ID, String HIRE_DATE, String ENT_DATE, String ENT_YN) {
                this.EMP_ID = EMP_ID;
                this.EMP_NAME = EMP_NAME;
                this.EMP_NO = EMP_NO;
                this.EMAIL = EMAIL;
                this.PHONE = PHONE;
                this.DEPT_CODE = DEPT_CODE;
                this.JOB_CODE = JOB_CODE;
                this.SAL_LEVEL = SAL_LEVEL;
                this.SALARY = SALARY;
                this.BONUS = BONUS;
                this.MANAGER_ID = MANAGER_ID;
                this.HIRE_DATE = HIRE_DATE;
                this.ENT_DATE = ENT_DATE;
                this.ENT_YN = ENT_YN;
        }

        public int getEMP_ID() {
                return EMP_ID;
        }

        public void setEMP_ID(int EMP_ID) {
                this.EMP_ID = EMP_ID;
        }

        public String getEMP_NAME() {
                return EMP_NAME;
        }

        public void setEMP_NAME(String EMP_NAME) {
                this.EMP_NAME = EMP_NAME;
        }

        public int getEMP_NO() {
                return EMP_NO;
        }

        public void setEMP_NO(int EMP_NO) {
                this.EMP_NO = EMP_NO;
        }

        public String getEMAIL() {
                return EMAIL;
        }

        public void setEMAIL(String EMAIL) {
                this.EMAIL = EMAIL;
        }

        public int getPHONE() {
                return PHONE;
        }

        public void setPHONE(int PHONE) {
                this.PHONE = PHONE;
        }

        public String getDEPT_CODE() {
                return DEPT_CODE;
        }

        public void setDEPT_CODE(String DEPT_CODE) {
                this.DEPT_CODE = DEPT_CODE;
        }

        public String getJOB_CODE() {
                return JOB_CODE;
        }

        public void setJOB_CODE(String JOB_CODE) {
                this.JOB_CODE = JOB_CODE;
        }

        public String getSAL_LEVEL() {
                return SAL_LEVEL;
        }

        public void setSAL_LEVEL(String SAL_LEVEL) {
                this.SAL_LEVEL = SAL_LEVEL;
        }

        public int getSALARY() {
                return SALARY;
        }

        public void setSALARY(int SALARY) {
                this.SALARY = SALARY;
        }

        public double getBONUS() {
                return BONUS;
        }

        public void setBONUS(double BONUS) {
                this.BONUS = BONUS;
        }

        public int getMANAGER_ID() {
                return MANAGER_ID;
        }

        public void setMANAGER_ID(int MANAGER_ID) {
                this.MANAGER_ID = MANAGER_ID;
        }

        public String getHIRE_DATE() {
                return HIRE_DATE;
        }

        public void setHIRE_DATE(String HIRE_DATE) {
                this.HIRE_DATE = HIRE_DATE;
        }

        public String getENT_DATE() {
                return ENT_DATE;
        }

        public void setENT_DATE(String ENT_DATE) {
                this.ENT_DATE = ENT_DATE;
        }

        public String getENT_YN() {
                return ENT_YN;
        }

        public void setENT_YN(String ENT_YN) {
                this.ENT_YN = ENT_YN;
        }

        @Override
        public String toString() {
                return "DTO{" +
                        "EMP_ID=" + EMP_ID +
                        ", EMP_NAME='" + EMP_NAME + '\'' +
                        ", EMP_NO=" + EMP_NO +
                        ", EMAIL='" + EMAIL + '\'' +
                        ", PHONE=" + PHONE +
                        ", DEPT_CODE='" + DEPT_CODE + '\'' +
                        ", JOB_CODE='" + JOB_CODE + '\'' +
                        ", SAL_LEVEL='" + SAL_LEVEL + '\'' +
                        ", SALARY=" + SALARY +
                        ", BONUS=" + BONUS +
                        ", MANAGER_ID=" + MANAGER_ID +
                        ", HIRE_DATE='" + HIRE_DATE + '\'' +
                        ", ENT_DATE='" + ENT_DATE + '\'' +
                        ", ENT_YN='" + ENT_YN + '\'' +
                        '}';
        }
}
