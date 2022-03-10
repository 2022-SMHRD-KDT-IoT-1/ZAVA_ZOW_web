<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background-image: url('images/KakaoTalk_20220306_202213774.png');
	background-size: cover;
	background-repeat: no-repeat;
}
div{
	font-size: 20px;
	font-weight: bold;
}
#stop1{
	width : 200px;
	height: 50px;
	position: absolute;
	top: 40.5%;
	right: 13%;
}
#stop2{
	width : 200px;
	height: 50px;
	position: absolute;
	top: 54.5%;
	right: 13%;
}
#stop3{
	width : 200px;
	height: 50px;
	position: absolute;
	top: 68.5%;
	right: 13%;
}
#stop4{
	width : 200px;
	height: 50px;
	position: absolute;
	top: 82.5%;
	right: 13%;
}
.signal{
	width: 30px;
	height: 30px;
	background-color: #9acd32;
	border-radius: 50%;
}
#signal1{
	position: absolute;
	top: 40.5%;
	right: 35.6%;
}
#signal2{
	position: absolute;
	top: 54.5%;
	right: 35.6%;
}
#signal3{
	position: absolute;
	top: 68.5%;
	right: 35.6%;
}
#signal4{
	position: absolute;
	top: 82.5%;
	right: 35.6%;
}
</style>
</head>
<body>
<div id="stop1">1</div>
<div id="stop2">2</div>
<div id="stop3">3</div>
<div id="stop4">4</div>
<div id="signal1" class="signal"></div>
<div id="signal2" class="signal"></div>
<div id="signal3" class="signal"></div>
<div id="signal4" class="signal"></div>

<script>
setInterval(() => {
	fetch('/ProjectTest/api/test')
	.then(function(response) {
	  return response.json();
	})
	.then(function(myJson) {
		/* document.body.innerText += JSON.stringify(myJson) + "\r\n"; */
		
		
		let currStopId = myJson.BUSLOCATION_LIST["currStopId"];
		let busId = myJson.BUSLOCATION_LIST["busId"];
		
		console.log(busId);
		
		for(var i = 0; i < myJson.BUSSTOP_LIST.length; i++){
			if (currStopId == myJson.BUSSTOP_LIST[i]["busStopId"]){
				break;
			}
		}
		
		console.log(currStopId);
		
		let stopNameArr = new Array();
		let stopIdArr = new Array();
		
		for(var j = i; j < i + 4; j++){
			/* console.log(myJson.BUSSTOP_LIST[j]["busStopName"]); */
			stopNameArr[j-i] = myJson.BUSSTOP_LIST[j]["busStopName"];
			stopIdArr[j-i] = myJson.BUSSTOP_LIST[j]["busStopId"];
		}
		
		for(var k = 0; k < myJson.RESERVATION_LIST.length; k++){
			/* console.log(myJson.RESERVATION_LIST[k]["busId"]); */
			if(busId == myJson.RESERVATION_LIST[k]["busId"]){
				break;
			}
		}
		
		
		document.getElementById('stop4').innerText = stopNameArr[0];
		document.getElementById('stop3').innerText = stopNameArr[1];
		document.getElementById('stop2').innerText = stopNameArr[2];
		document.getElementById('stop1').innerText = stopNameArr[3];
		
		let reservedStopId = myJson.RESERVATION_LIST[k]["busStopId"];
		let reservationYN = myJson.RESERVATION_LIST[k]["reservationYN"];
		
		console.log(reservedStopId);
		console.log(reservationYN);
		
		var m = 0;
		for(var l = 0; l < stopIdArr.length; l++){
			if(stopIdArr[l] == reservedStopId){
				m = l;
				break;
			}
		}
		let seq = (4-m).toString();
		let signalId = 'signal' +seq;
		/* console.log(signalId); */
		
		/* for(var n = 0; n < document.getElementByClassName('signal').length; n++){
			document.getElementByClassName('signal')[n].style.backgroundColor = "#9acd32";
			
		} */
		document.getElementById('signal1').style.backgroundColor = "#9acd32";
		document.getElementById('signal2').style.backgroundColor = "#9acd32";
		document.getElementById('signal3').style.backgroundColor = "#9acd32";
		/* document.getElementById('signal4').style.backgroundColor = "#9acd32"; */
		document.getElementById(signalId).style.backgroundColor = "red";
		/* if(reservedStopId != null){
		} */
		/* document.getElementById('signal4').style.backgroundColor = "#9acd32"; */
		
		
	});
}, 3*1000);

</script>	
</body>
</html>