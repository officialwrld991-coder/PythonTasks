from unittest import TestCase
import checker

class TestCheckNumber(TestCase):

    def test_that_validate_number_is_true(self):
        is_true = checker.check_number(20)
        self.assertTrue(is_true)
