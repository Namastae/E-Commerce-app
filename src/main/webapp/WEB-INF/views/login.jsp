<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login page</title>
<style type="text/css">
body {
 
  background-image :url("bg.jpg");
  background-position: 50% 50%;
  background-repeat: repeat;

background-color: #f4f4f4;
color: #5a5656;
font-family: 'Open Sans', Arial, Helvetica, sans-serif;
font-size: 16px;
line-height: 1.5em;
}
a { text-decoration: none; }
h1 { font-size: 1em; 
text-align:center;}
h2  { font-size: 1em;}
h1, p {
margin-bottom: 10px;
}
strong {
font-weight: italic;
color:blue;

}
strong1{
font-weight:italic;
color:red;
}
.uppercase { text-transform: uppercase; }

/* ---------- LOGIN ---------- */
#login {
margin: 50px auto;
width: 300px;
}
form fieldset input[type="text"], input[type="password"] {
background-color: #e5e5e5;
border: none;
border-radius: 3px;
-moz-border-radius: 3px;
-webkit-border-radius: 3px;
color: #5a5656;
font-family: 'Open Sans', Arial, Helvetica, sans-serif;
font-size: 14px;
height: 50px;
outline: none;
padding: 0px 10px;
width: 280px;
-webkit-appearance:none;
}
form fieldset input[type="submit"] {
background-color: #008dde;
border: none;
border-radius: 3px;
-moz-border-radius: 3px;
-webkit-border-radius: 3px;
color: #f4f4f4;
cursor: pointer;
font-family: 'Open Sans', Arial, Helvetica, sans-serif;
height: 50px;
text-transform: uppercase;
width: 300px;
-webkit-appearance:none;
}
form fieldset a {
color: #5a5656;
font-size: 10px;
}
form fieldset a:hover { text-decoration: underline; }





</style>
</head>
<body >


<div id="login">


<h2><strong1>THE MOBILE STORE</strong1></h2>
<h1><strong>Welcome!!!</strong></h1>

<form action="javascript:void(0);" method="get">
<fieldset>
<p><input type="text" required value="Username" onBlur="if(this.value=='')this.value='Username'" onFocus="if(this.value=='Username')this.value='' "></p>
<p><input type="password" required value="Password" onBlur="if(this.value=='')this.value='Password'" onFocus="if(this.value=='Password')this.value='' "></p>

<p><input type="submit" value="Login"></p>
</fieldset>
</form>



</div> <!-- end login -->
</body>
</html>