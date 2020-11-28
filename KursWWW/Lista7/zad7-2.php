<?php
$IsPostFormData = (isset($_POST["sent"]) && ($_POST["sent"]=="y"));
$IsGetFormData = (isset($_GET["sent"]) && ($_GET["sent"]=="y"));
	$nrKarty = ""; 
	$dataWaznosci = "";
	$nrCVC = "";
	$imie = "";
 	$nazwisko = "";
	$email = "";		
	$nrTelefonu = "";
	$kwota  = "";
	
	if($IsGetFormData):
		$nrKarty = $_GET["nrKarty"]; 
		$dataWaznosci = $_GET["dataWaznosci"];
		$nrCVC = $_GET["nrCVC"];
		$imie = $_GET["imie"];
	 	$nazwisko = $_GET["nazwisko"];
		$email = $_GET["email"];		
		$nrTelefonu = $_GET["nrTelefonu"];
		$kwota  = $_GET["kwota"];
	endif;
	
?>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Dane osobowe</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
td,th,body { font-family:Verdana, Arial, Helvetica, sans-serif; font-size:10pt; }
.error h4{
	color: red;
}

</style>
</head>

<body>

<h3 align="center">Dane osobowe</h3>

<form name="dane" action="zad7-2.php" method="get">
<table align="center" cellpadding="4" cellspacing="2" border="0" bgcolor="#FF9900">
<tr><th align="left">Nr Karty:</th><td><input name="nrKarty" type="text" size="16" maxlength="16" value=<?php echo $nrKarty?>></td></tr>
<tr><th align="left">Data ważności:</th><td><input name="dataWaznosci" type="date" min = <?php echo date('Y-m-d');?> value=<?php echo $dataWaznosci?>></td></tr>
<tr><th align="left">Nr CVC:</th><td><input name="nrCVC" type="text" size="3" maxlength="3" value=<?php echo $nrCVC?>></td></tr>

<tr><th align="left">Imię:</th><td><input name="imie" type="text" size="15" maxlength="20" value=<?php echo $imie?>></td></tr>
<tr><th align="left">Nazwisko:</th><td><input name="nazwisko" type="text" size="20" maxlength="40" value=<?php echo $nazwisko?>></td></tr>
<tr><th align="left">Email:</th><td><input name="email" type="text" size="20" maxlength="40" value=<?php echo $email?>></td></tr>

<tr><th align="left">Nr Telefonu:</th><td><input name="nrTelefonu" type="text" size="20" maxlength="11" value=<?php echo $nrTelefonu?>></td></tr>
<tr><th align="left">Kwota:</th><td><input name="kwota" type="number" size="7" maxlength="7" value=<?php echo $kwota?>></td></tr>

<tr><td align="right" colspan="2"><input type="submit" value="Wyślij"></td></tr>
</table>
<input name="sent" type="hidden" value="y">
</form>

<?php
if ( $IsGetFormData ):
	$nrKarty = $_GET["nrKarty"]; 
	$nrKartyDobry = preg_match('/[0-9]{16}/', $nrKarty);
	
	$dataWaznosci = $_GET["dataWaznosci"];
	$nrCVC = $_GET["nrCVC"];
	
	$imie = $_GET["imie"];
	$imieDobre = preg_match('/^[A-Z]{2,40}$/', $imie);
	
 	$nazwisko = $_GET["nazwisko"];
	$nazwiskoDobre = preg_match('/^[A-Z]{2,40}$/', $nazwisko);

	$email = $_GET["email"];
	$emailDobry = preg_match('/^[A-Za-z0-9._-]{1,20}@[a-z]{2,7}.[a-z]{2,4}/', $email);
		
	$nrTelefonu = $_GET["nrTelefonu"];
	$nrTelefonuDobry = preg_match('/^48[5-8]{1}[0-9]{8}$/', $nrTelefonu);
	
	$kwota  = $_GET["kwota"];
?>

<table cellpadding="4" cellspacing="2" border="1" align="center">
<tr><th>Nr Karty:</th><td><?php echo $_GET["nrKarty"]; ?></td></tr>
<tr><th>Data waznosci:</th><td><?php echo $_GET["dataWaznosci"]; ?></td></tr>
<tr><th>Nr cvc:</th><td><?php echo $_GET["nrCVC"]; ?></td></tr>

<tr><th>Imię:</th><td><?php echo $_GET["imie"]; ?></td></tr>
<tr><th>Nazwisko:</th><td><?php echo $_GET["nazwisko"]; ?></td></tr>
<tr><th>Email:</th><td><?php echo $_GET["email"]; ?></td></tr>

<tr><th>nrTelefonu:</th><td><?php echo $_GET["nrTelefonu"]; ?></td></tr>
<tr><th>Kwota:</th><td><?php echo $_GET["kwota"]; ?></td></tr>


</table>
<?php
endif;
?>

<?php 
	if($nrKartyDobry - $IsGetFormData < 0 ):	
?>
	<span class = "error">
		<h4>Zły numer karty.</h4>
	</span>
<?php endif;?>

<?php 
	if($imieDobre - $IsGetFormData < 0):	
?>
	<span class = "error">
		<h4>Złe podane imie. Musi zawierać tylko litery alfabetu łacińskiego.</h4>
	</span>
<?php endif;?>

<?php 
	if($nazwiskoDobre - $IsGetFormData < 0):	
?>
	<span class = "error">
		<h4>Złe podane nazwisko. Musi zawierać tylko litery alfabetu łacińskiego.</h4>
	</span>
<?php endif;?>

<?php 
	if($emailDobry - $IsGetFormData < 0):	
?>
	<span class = "error">
		<h4>Zły email.</h4>
	</span>
<?php endif;?>

<?php 
	if($nrTelefonuDobry - $IsGetFormData < 0):	
?>
	<span class = "error">
		<h4>Zły numer telefonu. Musi zawierać tylko liczby. </h4>
	</span>
<?php endif;?>
</body>
</html>