<?php
    function faculty(int $n) {
        for($n; $n > 1; $n--) {
            $n*($n-1);
            echo $n;
         }
    }
    faculty(5);
?>