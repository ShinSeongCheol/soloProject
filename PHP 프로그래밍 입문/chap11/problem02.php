<?php
    $id = $_GET["id"];
    if(!$id)
        echo("<li>아이디를 입력해 주세요!</li>");
    else {
        $con = mysqli_connect("localhost", "user1", "12345", "sample");
        $sql = "SELECT * FROM members where id = '$id'";
        $result = mysqli_query($con, $sql);
        $num_record = mysqli_num_rows($result);

        if($num_record) {
            echo "<li>".$id." 아이디는 중복됩니다.</li>";
            echo "<li>다른 아이디를 사용해 주세요!</li>";
        }
        else {
            echo "<li>".$id." 아이디는 사용 가능합니다.</li>";
        }
        mysqli_close($con);
    }
?>