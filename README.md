# ZAVA_ZOW_web
Smart Bus Information System with Arduino &amp; Web

## 프로젝트명
- 스마트 버스 정보 안내 시스템 - 도착정보, 환승태그, 온·오프라인 승차벨
- Challenge Point : 공공버스 API 사용, TFT 사용, NFC태그 사용, 버튼 사용, 웹 개발

## 주요 기능
- API 통한 도착정보 안내(Arduino)
- NFC태그 이용한 환승태그(Arduino)
- 오프라인 승차 벨(Arduino)
- 온라인 승차 벨(Web)
- 버스회사 정보 확인(Web)
- 통합 게시판(칭찬, 건의, 자유)(Web)

## 개발환경
- 사용언어 : Java 1.8 / HTML / CSS / Javascript / C++(Arduino)
- 개발도구 : eclipse / Arduino
- 서버환경 : tomcat 9.0
- 데이터베이스 : oracle
- 디자인도구 : Kakao Oven

## 대표이미지
![1](https://user-images.githubusercontent.com/99253941/158058274-fa3a1bbe-c194-4cf4-819f-378e3c320849.jpg)
![2](https://user-images.githubusercontent.com/99253941/158058321-950d1a5f-8bd0-42dc-878d-bdc29abf3ca3.jpg)

## 기능 흐름도
- 통합 커뮤니티
![3](https://user-images.githubusercontent.com/99253941/158059185-0ff5a41a-e5fa-48a2-a870-201e86859d8d.jpg)
![4](https://user-images.githubusercontent.com/99253941/158059186-24afe392-db5e-4097-8c74-d990083099dc.jpg)
![5](https://user-images.githubusercontent.com/99253941/158059189-31b3cdd1-2fb8-4941-86e2-306664d24498.jpg)
![6](https://user-images.githubusercontent.com/99253941/158059191-c539182f-554e-490d-8369-b018d58e996c.jpg)

- 온라인 승차 벨(도심형 BIS 주요기능)
![7](https://user-images.githubusercontent.com/99253941/158059201-a9c92d2b-6a6c-421c-8c8d-915ec2853bbc.jpg)

- 환승 태그(도심형 BIS 주요기능)
![8](https://user-images.githubusercontent.com/99253941/158059207-a0bb1b0e-2d01-4e3e-9013-92d5c0d80e47.jpg)

- 도심형 BIS 화면(도심형 BIS 주요기능)
![9](https://user-images.githubusercontent.com/99253941/158059456-c3005b01-6855-4b6c-b74b-3f459ba7bb6a.jpg)

- 오프라인 승차 벨(골목형 BIS 주요기능)
![10](https://user-images.githubusercontent.com/99253941/158059474-17c4d70b-b4e9-4065-8ab8-68bd442d0d57.jpg)

## 사용 부품
- 도심형 BIS
![15](https://user-images.githubusercontent.com/99253941/158060519-86c68255-f87b-4db2-918e-5570ed0fe637.jpg)

- 골목형 BIS
![16](https://user-images.githubusercontent.com/99253941/158066447-9da43790-861d-40a3-abe2-7c72ccf3a164.jpg)

## 회로도
- 도심형 BIS 화면(2.2인치 TFT LCD)
![19](https://user-images.githubusercontent.com/99253941/158065086-7878b5b5-0f4f-4efd-ae66-ff9e50e7b948.jpg)

- 환승 태그(RFID RC522)
![17](https://user-images.githubusercontent.com/99253941/158065097-1fbec2a9-b4e4-4f0e-b10d-98571e9809b6.jpg)

- 오프라인 승차 벨(LED 택트 스위치)
![18](https://user-images.githubusercontent.com/99253941/158065109-fa70faa6-1417-4fda-934f-36a8769ab680.jpg)

## 활용 사진 예시
- 도심형 BIS
![11](https://user-images.githubusercontent.com/99253941/158060104-cf7f4a8b-e20f-4a0b-86e7-75f82694ebc8.jpg)

- 골목형 BIS
![12](https://user-images.githubusercontent.com/99253941/158060146-8d078032-b7ee-4ea9-9c25-de2d4d9eb869.jpg)

- 통합 커뮤니티(메인, 온라인 승차 벨, 게시판, 버스회사 정보, 버스 기사 인터페이스)
![3](https://user-images.githubusercontent.com/99253941/158060320-ba053551-37c4-4a4d-83e5-10e174d342bf.jpg)
![13](https://user-images.githubusercontent.com/99253941/158060329-ed832485-4c9a-40c5-a6c2-29cdfc608623.jpg)
![5](https://user-images.githubusercontent.com/99253941/158060333-cce82d32-8798-4958-a63c-97d9e424c34f.jpg)
![6](https://user-images.githubusercontent.com/99253941/158060336-43baac81-6d76-4d54-97ee-02905773cd08.jpg)
![14](https://user-images.githubusercontent.com/99253941/158060344-983ae868-e7d8-42cc-8d9d-87f18cd22646.jpg)

## 제작 일정
| 일정   | 상세내용                    |
|------- |-------------------------|
| 2.14 ~ 2.18 | 기획 및 DB 설계       |
| 2.19 ~ 2.21 | 데이터 수집 |
| 2.22 ~ 3.5 | 기능 구현 및 화면 구현 |
| 3.6 | 시제품 제작 |
| 3.7 | 발표 준비 및 발표 |

## 팀원 단위 업무 분장 및 결과표
| 이름   | 역할                    |
|------- |-------------------------|
| 한ㅇ무 | 환승 태그 개발       |
|        | 오프라인 승차 벨 개발 |
| 하ㅇ준 | 버스기사 인터페이스 개발 |
|        | 도심형 BIS 화면 개발 |
| 박ㅇ범 | Web 프론트엔드 개발 |
|        | 시제품 제작 |
| 박ㅇ애 | Web 백엔드 개발 |
|       | 시제품 제작 |
| 최ㅇ영 | 시제품 3D 모델링 |
|        | 시제품 제작 |
