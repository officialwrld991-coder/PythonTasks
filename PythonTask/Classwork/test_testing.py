import unittest
import testing

class TestCubeFunction(unittest.TestCase):
    
    def test_that_cube_function_exists(self):
        testing.cube(3)
    def test_that_cube_function_return_correct_result(self):
        actual = testing.cube(3)
        expected = 27
        self.assertEqual(actual, expected)
