<?php
  // Initialize an array with mixed data types
  $myArray = [
    10, 
    "hello", 
    true, 
    ["name" => "Alice"], 
    null 
  ];
  
  // Modify an element
  $myArray[1] = "world";
  
  // Add elements (dynamic resizing)
  $myArray[] = 3.14;  // Add to the end
  array_unshift($myArray, "start"); // Add to the beginning
  
  // Remove elements
  array_pop($myArray); // Remove from the end
  array_shift($myArray); // Remove from the beginning
  
  // Accessing elements (including null)
  echo $myArray[0] . PHP_EOL; // Output: world
  echo $myArray[3] . PHP_EOL; // Output: Array (but will give warning since Array is converted to string)
  
  // Demonstrate dynamic resizing
  for ($i = 0; $i < 5; $i++) {
    $myArray[] = $i * 5;
  }
  
  print_r($myArray); 
  // Output: Array ( [0] => world [1] => true [2] => Array ( [name] => Alice ) [3] =>  [4] => 0 [5] => 5 [6] => 10 [7] => 15 [8] => 20 )
?>