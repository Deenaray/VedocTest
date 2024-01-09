from selenium import webdriver
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities
import os
selenium_hub_url= os.environ.get("SELENIUM_HUB_URL")
browser= os.environ.get("BROWSER")
def test_python_title():
    if browser == "CHROME":
      desired_capabilities = DesiredCapabilities.CHROME
    elif browser == "FIREFOX":
      desired_capabilities = DesiredCapabilities.FIREFOX
    else:
      raise f"Driver {browser} is not supported"
    print("URL=$(params.selenium_hub_url)")
    driver = webdriver.Remote(
        # Use public / floating IP address
        command_executor=selenium_hub_url,
        desired_capabilities=desired_capabilities.copy()
    )
    driver.get("https://www.python.org")
    assert driver.title == "Welcome to Python.org"
    driver.close()
