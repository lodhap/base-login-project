sql

CREATE USER base_login_project IDENTIFIED BY tiger;
GRANT CONNECT, RESOURCE TO base_login_project;

---- 사용자 (memberDB) 테이블
CREATE TABLE memberDB (
    userId VARCHAR2(50) PRIMARY KEY,
    userPw VARCHAR2(50) NOT NULL CHECK (LENGTHB(userPw) >= 4),
    nickname VARCHAR2(30) UNIQUE NOT NULL,
    restoreUserEmailId VARCHAR2(50),
    restoreUserEmailDomain VARCHAR2(50),
    googleConnected NUMBER(1, 0) DEFAULT '0' CHECK (googleConnected IN ('1', '0')),
    naverConnected NUMBER(1, 0) DEFAULT '0' CHECK (naverConnected IN ('1', '0')),
    kakaoConnected NUMBER(1, 0) DEFAULT '0' CHECK (kakaoConnected IN ('1', '0')),
    userSignDate VARCHAR2(10) DEFAULT TO_CHAR(SYSDATE, 'yyyy/MM/dd') NOT NULL,
    userType VARCHAR2(1) DEFAULT '1' NOT NULL CHECK (userType IN ('0', '1', '2', '3', '4'))
);