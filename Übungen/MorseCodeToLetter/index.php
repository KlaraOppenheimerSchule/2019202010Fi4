<!DOCTYPE html>
<html>
    <body>
        <form>
            <form action="Dictionary.php" method="GET">
            <input  type="text" name="text">
            <input  type="submit" name="senden">
        </form>
        <?php
        $text = "";
        $text = ($_GET["text"]);


        $textLenght = 0;
        $textLenght = strlen($text);

        $i = 1;

        
        while ($i <= $textLenght)
        {
            echo $i
        };

        echo $text[0];


        ?>
    </body>
</html>