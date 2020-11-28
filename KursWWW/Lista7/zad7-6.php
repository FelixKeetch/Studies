<?php

  setcookie( "Somebody" , "Once", time()+3600);
  // setcookie( "ToCiastko" , "Zniknie");
  // When a cookie is set for blog.com, it is also valid for its subdomains, 
  //i.e. cookiesecurity.blog.com & attacker.blog.com, as well as for 
  //its subfolders, i.e. blog.com/cookiesecurity & blog.com/attacker.
?>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Ciasteczka</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
td,th,body { font-family:Verdana, Arial, Helvetica, sans-serif; font-size:10pt; }
</style>
</head>

<body>

<h3>Wartość ciastka</h3>

Ciasteczko: <?php echo $_COOKIE["Somebody"]; ?>

</body>
</html>
