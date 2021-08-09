
# AxiosGetDataListOnJsp
Jsp 에서 Axios 로 데이터를 가져오고 table에 append 해보자.

# 사용법(서버)
<img width="509" alt="스크린샷 2021-08-09 오후 10 24 48" src="https://user-images.githubusercontent.com/69393030/128713414-95f67623-8307-495b-833c-4798ef2a4fec.png">
서버에서는 Data를 DB 에서 가져와서 HashMap 형태 / List 형태 / ArrayList 형태로 return 해줍니다.
# 사용법(클라이언트)
<img width="766" alt="스크린샷 2021-08-09 오후 10 26 02" src="https://user-images.githubusercontent.com/69393030/128713569-79ee8241-525f-4e78-808d-5f14176e222c.png">
클라이언트에서는(jsp/vue/react/vanila js) axios / ajax transaction후 , 데이터를 가공하여 동적으로 append 해줍니다.

# vue 를 이용한 렌더링방법 
<img width="766" alt="스크린샷 2021-08-09 오후 10 27 28" src="https://user-images.githubusercontent.com/69393030/128713802-735a4142-0098-4433-8cf3-8673bb118227.png">
vue transaction 후 v-for 문법을 이용합니다.

# jsp 를 이용한 렌더링 방법
jsp 에서 model 로 받아서 jstl foreach문법을 사용합니다.
# Example Result 
<img width="1192" alt="스크린샷 2021-08-09 오후 10 28 43" src="https://user-images.githubusercontent.com/69393030/128713966-8acc786b-d33e-4c6b-99a9-f53df9ef8174.png">
