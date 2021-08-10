<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 테스트 </h1>


  <table class='table'>
            <thead>
                <tr>
                    <th scope='col'>#</th>
                    <th scope='col'>Name</th>
                    <th scope='col'>Table</th>
                    <th scope='col'>No. Items Won</th>
                    <th scope='col'>Pledges</th>
                    <th scope='col'>Amount Owed</th>
                    <th scope='col'>Invoice</th>
                </tr>
            </thead>
            <tbody id='bidders'>

            </tbody>
        </table>





</body>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script>
$( document ).ready(function() {
	
    alert("hello world");
    var newTbody = $("<table class='table table-striped'></table>");
    axios.get('http://localhost:8082/mymy/getTestData')  
    .then((res)=>{
        console.log(res.data);
        for(var i=0;i<res.data.length;i++){
        	console.log(res.data);
        	 $('#bidders').append('<tr><td>' + res.data[i]['bContent'] + '</td><td>' + res.data[i]['bDate'] + '</td><td>' + res.data[i]['bGroup'] + '</td><td>' + res.data[i]['bHit'] + '</td><td>' + res.data[i]['bId'] + '</td><td>' + res.data[i]['bIndent'] + '</td><td>' + res.data[i]['bName'] + '</td><td>' + res.data[i]['bStep'] + '</td><td>' + res.data[i]['bTitle'] + '</td><td>' + res.data[i]['file_image'] + '</td></tr>');
     	}
     
        
    }) 
});


</script>

</html>
