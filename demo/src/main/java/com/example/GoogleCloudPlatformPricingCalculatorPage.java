package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GoogleCloudPlatformPricingCalculatorPage {


        private WebDriver driver;
        public GoogleCloudPlatformPricingCalculatorPage(WebDriver driver) {
            this.driver = driver;
        }
     //   private static final By COMPUTE_ENGINE_TAB = By.xpath("/html/body");
    private static final By NUMBER_OF_INSTANCES_FIELD = By.xpath("/html/body/md-content/md-card/div/md-card-content[1]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[1]/div[1]/md-input-container/input");
    private static final By OPERATING_SYSTEM_DROPDOWN = By.xpath("//label[text()='Operating System / Software']/following-sibling::md-select");
    private static final By FREE_OPERATING_SYSTEM_OPTION = By.xpath("//md-option[contains(text(), 'Free: Debian')]");
    private static final By VM_CLASS_DROPDOWN = By.xpath("//label[text()='VM Class']/following-sibling::md-select");
    private static final By REGULAR_VM_CLASS_OPTION = By.xpath("//md-option[contains(text(), 'Regular')]");
    private static final By INSTANCE_TYPE_DROPDOWN = By.xpath("//label[text()='Instance type']/following-sibling::md-select");
    private static final By N1_STANDARD_8_INSTANCE_TYPE_OPTION = By.xpath("//md-option[contains(text(), 'n1-standard-8 (vCPUs: 8, RAM: 30GB)')]");
    private static final By ADD_GPUS_CHECKBOX = By.xpath("//md-checkbox[@aria-label='Add GPUs']");
    private static final By NUMBER_OF_GPUS_DROPDOWN = By.xpath("//label[text()='Number of GPUs']/following-sibling::md-select");
    private static final By ONE_GPU_OPTION = By.xpath("//md-option[contains(text(), '1')]");
    private static final By GPU_TYPE_DROPDOWN = By.xpath("//label[text()='GPU type']/following-sibling::md-select");
    private static final By NVIDIA_TESLA_V100_GPU_TYPE_OPTION = By.xpath("//md-option[contains(text(), 'NVIDIA Tesla V100')]");
    private static final By LOCAL_SSD_DROPDOWN = By.xpath("//label[text()='Local SSD']/following-sibling::md-select");
    private static final By TWO_TIMES_375_GB_LOCAL_SSD_OPTION = By.xpath("//md-option[contains(text(), '2x375 GB')]");
    private static final By DATACENTER_LOCATION_DROPDOWN = By.xpath("//label[text()='Datacenter location']/following-sibling::md-select");
    private static final By FRANKFURT_DATACENTER_LOCATION_OPTION = By.xpath("//md-option[contains(text(), 'Frankfurt')]");
    private static final By COMMITTED_USAGE_DROPDOWN = By.xpath("//label[text()='Committed usage']/following-sibling::md-select");
    private static final By ONE_YEAR_COMMITTED_USAGE_OPTION = By.xpath("//md-option[contains(text(), '1 Year')]");

    private static final By ADD_TO_ESTIMATE_BUTTON = By.xpath("//button[@aria-label='Add to Estimate']");
    private static final By VM_CLASS_LABEL = By.xpath("//div[contains(text(), 'VM class')]/following-sibling::div");
    private static final By INSTANCE_TYPE_LABEL = By.xpath("//div[contains(text(), 'Instance type')]/following-sibling::div");
    private static final By REGION_LABEL = By.xpath("//div[contains(text(), 'Region')]/following-sibling::div");
    private static final By LOCAL_SSD_LABEL = By.xpath("//div[contains(text(), 'Local SSD')]/following-sibling::div");
    private static final By COMMITMENT_TERM_LABEL = By.xpath("//div[contains(text(), 'Commitment term')]/following-sibling::div");

    public void fillform() {
       // driver.findElement(COMPUTE_ENGINE_TAB).click();

        driver.findElement(NUMBER_OF_INSTANCES_FIELD).sendKeys("4");
        
    }


    }
    



