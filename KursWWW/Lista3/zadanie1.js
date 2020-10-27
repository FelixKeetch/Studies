function validateEmail(email) 
    {
        var re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return re.test(email);
    }
function validateKonto(numer)
    {
        var re = /^[0-9]{26}$/;
        return re.test(numer);

    }
function validateDate(date)
    {
        var re = /^2...\/(01|02|03|04|05|06|07|08|09|10|11|12)\/((0|1|2|)\d|(3(0|1)))$/;
        return re.test(date);
    }
function validatePesel(numer)
    {
        var re = /^[0-9]{11}$/;
        return re.test(numer);
    }

function checkKonto(){
    if(!validateKonto(document.getElementById("nrKonta").value)){
        document.getElementById("lblErrorK").innerHTML = 
        "Zły numer konta";
        return false;
    }else{
        document.getElementById("lblErrorK").innerHTML = 
        " ";
        return true;
    }
}

document.getElementById("nrKonta").onblur = checkKonto;

function checkPesel(){
    if(!validatePesel(document.getElementById("pesel").value)){
        document.getElementById("lblErrorP").innerHTML = 
        "Zły numer pesel";
        return false;

    }else{
        document.getElementById("lblErrorP").innerHTML = 
        " ";
        return true;

    }
}
document.getElementById("pesel").onblur = checkPesel;

function checkEmail(){
    if(!validateEmail(document.getElementById("email").value)){
        document.getElementById("lblErrorE").innerHTML = 
        "Zły email";
        return false;

    }else{
        document.getElementById("lblErrorE").innerHTML = 
        " ";
        return true;

    }
}

document.getElementById("email").onblur = checkEmail;

document.getElementById("myForm").onsubmit = function () {
    checkKonto();
    checkEmail();
    checkPesel();
}
