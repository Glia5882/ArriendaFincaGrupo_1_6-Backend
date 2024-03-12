document.addEventListener('DOMContentLoaded', function () {
    var barra = document.getElementById('barra');

    barra.addEventListener('mouseover', function() {
        barra.classList.add('active');
    });

    barra.addEventListener('mouseout', function() {
        barra.classList.remove('active');
    });
});
