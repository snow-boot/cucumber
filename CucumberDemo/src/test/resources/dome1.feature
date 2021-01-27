@tag
Feature: Test add function of calculator
   @tag4
   Scenario Outline: Add two numbers
     Given 创建一个数据集
     When 清空数据集
     And 添加 <num1> 和 <num2>
     Then 检查结果 <expected>
     Examples:
       | num1 | num2 | expected |
       |  1   |  2   |    3     |
       |  2   |  3   |    5     |
       |  3   |  3   |    5     |
       |  4   |  3   |    7     |
