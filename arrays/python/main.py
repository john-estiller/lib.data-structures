# Initialize a list with mixed data types
my_list = [10, "hello", True, {"name": "Alice"}, None]  # None is Python's null equivalent

# Modify an element
my_list[1] = "world"

# Add elements (dynamic resizing)
my_list.append(3.14)
my_list.insert(0, "start")  # Insert at the beginning

# Remove elements
my_list.pop()  # Remove the last element
del my_list[0]  # Remove the first element

# Accessing elements
print(my_list[0])  # Output: world
print(my_list[4])  # Output: None

# Demonstrate dynamic resizing
for i in range(5):
    my_list.append(i * 5)

print(my_list)
# Output: ['world', True, {'name': 'Alice'}, None, 0, 5, 10, 15, 20]