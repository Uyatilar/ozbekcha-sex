// JavaScript kodi
document.addEventListener("DOMContentLoaded", function() {
    console.log("Hush kelibsiz");

    // Tugma bosilganda xabar chiqarish
    const alertButton = document.getElementById("alertButton");
    if (alertButton) {
        alertButton.addEventListener("click", function() {
            alert("Tugma bosildi!");
        });
    }
});
