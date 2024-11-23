function validate() {
    // Get values from the form
    var fname = document.getElementById("f1").value.trim();
    var lname = document.getElementById("f2").value.trim();
    var email = document.getElementById("f3").value.trim();
    var gender = document.querySelector('input[name="gender"]:checked');
    var phone = document.getElementById("phone").value.trim();
    var dob = document.getElementById("db").value;
    var password = document.getElementById("ps").value;
    var confirmPassword = document.getElementById("cps").value;

   
    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

   
    if (fname === "" || lname === "" || email === "" || !gender || phone === "" || dob === "" || password === "" || confirmPassword === "") {
        alert("All fields are required.");
        return false; 
    } else {
      
        let hasErrors = false;

       /* if (fname === "") {
            alert("First name is required.");
            hasErrors = true;
        }*/
       /* if (lname === "") {
            alert("Last name is required.");
            hasErrors = true;
        }*/
        if (!emailPattern.test(email)) {
            alert("Please enter a valid email address.");
            hasErrors = true;
        }
       /* if (!gender) {
            alert("Please select a gender.");
            hasErrors = true;
        }*/
         if (!/^\d{10}$/.test(phone)) {
            alert("Contact number must be exactly 10 digits.");
            hasErrors = true;
        }
       /* if (dob === "") {
            alert("Date of birth is required.");
            hasErrors = true;
        }*/
        if (password.length < 6) {
            alert("Password must be at least 6 characters long.");
            hasErrors = true;
        }
      /*  if (confirmPassword === "") {
            alert("Please confirm your password.");
            hasErrors = true;
        } */ if (password !== confirmPassword) {
            alert("Passwords do not match.");
            hasErrors = true;
        }

        if (hasErrors) {
            return false;
        }
    }

   
    return true;
}

function showpass(inputId) {
    var x = document.getElementById(inputId);
    x.type = (x.type === "password") ? "text" : "password";
}
