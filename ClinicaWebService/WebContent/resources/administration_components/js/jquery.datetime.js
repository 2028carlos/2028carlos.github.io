 

startDateTime();
function startDateTime() {
            var today = new Date();
            var h = today.getHours();
            var m = today.getMinutes();
            var s = today.getSeconds();
            // add a zero in front of numbers<10
            m = checkTime(m);
            s = checkTime(s);
            var meses = new Array("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
            var diasSemana = new Array("Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado");
            var f = new Date();
            document.getElementById("txtFecha").innerHTML = (diasSemana[f.getDay()] + ", " + f.getDate() + " de " + meses[f.getMonth()] + " de " + f.getFullYear() + " / ") + h + ":" + m + ":" + s;
            var t = setTimeout(function () { startDateTime() }, 500);

        }


        function checkTime(i) {
            if (i < 10) {
                i = "0" + i;
            }
            return i;
        }
