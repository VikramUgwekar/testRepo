<!DOCTYPE html>
<html>

<head>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>

<body>
    <p id="demo"></p>
    <p id="demo2"></p>

    <button onclick="getData()">try me</button>
	   <script>
	   var data = {10, 9,,10,4,5,6,1,3,6,7,3}
	   function getdata(data){
	   var length = data.length;
	   var count1=0;
	   var count2=0;
	   var out = 0;
	   for (int i = 0;i<=length; i++){
	   
	   if(data[i] >=6 && data[i]>=0){
	   count++;
	   }
	   if(data[i]==9 || data[i]==10){
	   count2++
	   }
	   out = Math.abs(count2-count1)/length
	   
	   }
	   document.getElementById('demo1').innerHTML=out;
	   }
	    </script>
</body>

</html>