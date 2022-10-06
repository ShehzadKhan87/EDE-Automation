package webelements;

import org.openqa.selenium.By;

public interface OR {
	By continueBtn = By.xpath("//button[contains(text(),'Continue')]");
	By sh_signIn = By.id("ctl00_ctl00_ucLogedInUser_lnkSignInStatus");
	By selectState = By.xpath("//select[@id='state']");
	By clickApplyOrRenew = By.xpath("//button[contains(text(),'Apply or Renew')]");
	By clickNext = By.xpath("//button[contains(text(),'Next')]");
	// Privacy and policy
	By iAgreeCheckBox = By.xpath("//span[contains(text(),'I agree')]");
	By iUnderstandCheckBox = By.xpath("//span[contains(text(),'I understand')]");
	By iAllowCheckBox = By.xpath("//span[contains(text(),'I allow')]");
	By saveAndContinueButton = By.xpath("//button[contains(text(),'SAVE & CONTINUE')]");

	// Contact Information
	By enterFirstName = By.xpath("//span[contains(text(),'First Name')]/../..//following-sibling::div//input");
	By enterMiddleName = By.xpath("//span[contains(text(),'Middle Name ')]/../..//following-sibling::div//input");
	By enterLastName = By.xpath("//span[contains(text(),'Last Name')]/../..//following-sibling::div//input");
	By enterDOB = By.xpath("//span[contains(text(),'Date of birth')]/../..//following-sibling::div//div//input");
	By enterStreetAddress = By.xpath("//span[text()='Street address']/../..//following-sibling::div//input");
	By enterCity = By.xpath("//span[contains(text(),'City')]/../..//following-sibling::div//input");
	By enterZipCode = By.xpath("//span[contains(text(),'ZIP code')]/../..//following-sibling::div//input");
	By enterZipCode2OnSamePage = By
			.xpath("(//span[contains(text(),'ZIP code')]/../..//following-sibling::div//input)[2]");
	By selectStateInContactInfo = By.xpath("//span[contains(text(),'State')]/../..//following-sibling::div//select");
	By selectStateInContactInfoOnSamePage = By
			.xpath("(//span[contains(text(),'State')]/../..//following-sibling::div//select)[2]");
	By selectCounty = By.xpath("//span[contains(text(),'County')]/../..//following-sibling::div//select");
	By continueAddressBtn = By.xpath("//button[contains( text(),'Continue')]");
	By addressRadiobtn = By
			.xpath("//div[contains(text(),'Select the correct address:')]//..//form//div//div//div//label");
	By enterPhoneNumber = By.xpath("//span[contains(text(),'Phone number')]/../..//following-sibling::div//input");
	By enterPhoneNumberJobB = By
			.xpath("(//span[contains(text(),'Phone number')]/../..//following-sibling::div//input)[2]");
	By selectWrittenLanguage = By.xpath("//select[contains(@aria-label,'Preferred written language')]");
	By selectSpokenLanguage = By.xpath("//select[contains(@aria-label,'Preferred spoken language')]");

	By clickAddPerson = By.xpath("//a[@class='btn theme-btn-secondary']");

	By enterSSN = By.xpath("//span[contains(text(),'Social Security Number')]/../..//following-sibling::div//input");
	By withOutSSN = By.xpath("//span[contains(text(),'does not have a SSN')]");
	By socialSecurityText = By.xpath("//span[contains(text(),'Social Security Number')]");
	By enterAlienNumber = By.xpath("//span[contains(text(),'Alien number')]/../..//following-sibling::div//input");
	By enterNaturalizeNumber = By.xpath(
			"//span[contains(text(),'Naturalization certificate number ')]/../..//following-sibling::div//input");
	By zipcodeText = By.xpath("//span[contains(text(),'ZIP code')]");
	By agreeOne = By.xpath("(//span[contains(text(),'I agree')])[1]");
	By agreeTwo = By.xpath("(//span[contains(text(),'I agree')])[2]");
	By signature = By.xpath("//input[@class='form-control']");
	By county = By.xpath("(//select[@class='form-control'])[2]");
	By countyOnSamePage = By.xpath("(//select[@class='form-control'])[4]");
	By eligibilityNoticeButton = By.xpath("//button[contains(text(),'View Eligibility Notice')]");
	By agreeTwoNew = By.xpath("(//span[contains(text(),'I agree')])[3]");
	By agreeThree = By.xpath("(//span[contains(text(),'I agree')])[4]");
	By agreeFour = By.xpath("(//span[contains(text(),'I agree')])[5]");
	By yesIReconcil = By.xpath("//span[contains(text(),'Yes')]");
	By clickLogoutDropDown = By.xpath("//span[@class='userDownArrow']//..");
	By clickLogout = By.xpath("//a[contains(text(),'Logout')]");
	By clickHome = By.xpath("//a[contains(text(),'Home')]");
	By clickApplication = By.xpath("//p[@class='theme-secondry-color text-center-sm']//a");
	By clickReportLifeChangeLink = By.xpath("//a[contains(text(),'Report a life change')]");
	By continueWithoutSsnButton = By.xpath("//button[contains(text(),'continue without ssn')]");
	By clickReportLifeChangeButton = By.xpath("(//a[contains(text(),'Report a life change')])[2]");
	By continueToEnrollmentBtn = By.xpath("//a[contains(text(),'Continue to enrollment')]");
	By backNavigation = By.xpath("//span[@class='backLink']//*[name()='svg']");
	By createSearchLink = By.xpath("//a[contains(text(),'Create/Search Marketplace application')]");
	By searchForApplicationBtn = By.xpath("//a[contains(text(),'SEARCH FOR APPLICATION')]");
	By checkBoxForSearch = By.xpath("//label[contains(text(),'Check here')]");
	By firstNameForSearch = By.xpath("//label[contains(text(),'First Name')]//..//input");
	By lastNameForSearch = By.xpath("//label[contains(text(),'Last Name ')]//..//input");
	By dobForSearch = By.xpath(
			"//label[contains(text(),'Last Name ')]//..//..//following-sibling::div//label[contains(text(),'Date of birth')]//..//div//input");
	By clickSearchButton = By.xpath("//div[@class='btn-block2']//button[contains(text(),'Search')]");
	By clickUpdateApplication = By.xpath("//span[contains(text(),' UPDATE APPLICATION')]");
	By selectIdentityProofing = By.xpath("//select[@title='proofingChannel']");
	By continueIdentityProofing = By.xpath("(//button[contains(text(),'Continue')])[2]");
	By loseCoverageDate = By.xpath("//div[@class='flatpickr dp-block-ruby']//input");
	By enterPlanName = By
			.xpath("//span[contains(text(),'Enter the name of the plan. ')]/../..//following-sibling::div//input");
	By selectDocument = By.xpath("//option[contains(text(),'Select')]//parent::select");
	By selectDocumentType = By.xpath("(//option[contains(text(),'Select')]//parent::select)[2]");
	By enterAlienNumberS019 = By.xpath("//input[contains(@aria-label,'alien number')]");
	By continueWithoutAddingMore = By.xpath("//button[contains(text(),'CONTINUE WITHOUT ADDING MORE')]");
	By enterExpenseAmount = By.xpath("//input[contains(@inputmode,'numeric')]");
	By enterAnualPerditedAmount = By.xpath("//input[@class='form-control']");
	By selectFosterCareState = By.xpath("//span[contains(text(),'state')]/../..//following-sibling::div//select");
	By enterAgeFosterCareLeft = By.xpath("//span[contains(text(),'How old')]/../..//following-sibling::div//input");
	By enterDateToFilledField = By.xpath("//input[@class='form-control flatpickr-input input w-95 datepicker masked']");
	By enterDateToFilledFieldOnSamePage = By
			.xpath("(//input[@class='form-control flatpickr-input input w-95 datepicker masked'])[2]");
	By selectGender_S038 = By.xpath("(//select[@class='form-control'])[2]");
	By selectTribe = By.xpath("(//select[@class='form-control'])[2]");
	By selectState_S075 = By.xpath("//span[contains(text(),'state')]/../..//following-sibling::div//select");
	By enterTribeIncomeAmount = By.xpath("(//input[contains(@inputmode,'numeric')])[2]");
	By clickAddNewIncomeSource = By.xpath("//a[contains(@onclick,'AddNewIncome')]");
	By enterCoverageName = By.xpath("//span[contains(text(),'Coverage Name ')]/../..//following-sibling::div//input");
	By enterPolicyNumber = By.xpath("//span[contains(text(),'Policy number ')]/../..//following-sibling::div//input");
	By describeExpense = By
			.xpath("//span[contains(text(),'Describe the expense ')]/../..//following-sibling::div//input");
	By startDateJobA = By.xpath("//span[contains(text(),'Start date')]/../..//following-sibling::div//div//input");
	By endDateJobA = By.xpath("//span[contains(text(),'End date')]/../..//following-sibling::div//div//input");
	By enterIchraAmountOffered = By.xpath("//input[contains(@inputmode,'numeric')]");
	By selectIchraAmountPeriod = By.xpath("//select[contains(@aria-label,'How often would')]");
	By enterHours = By.xpath("//input[contains(@aria-label,'How many hours')]");
	By s042StreetAddress = By.xpath("//span[text()='Street address ']/../..//following-sibling::div//input");
	By s073PremiumPeriod = By.xpath("//select[@class='form-control']");
	By startDateJobB = By.xpath("(//span[contains(text(),'Start date')]/../..//following-sibling::div//div//input)[2]");
	By endDateJobB = By.xpath("(//span[contains(text(),'End date')]/../..//following-sibling::div//div//input)[2]");
	By enterIchraAmountOfferedJobB = By.xpath("(//input[contains(@inputmode,'numeric')])[2]");
	By reasonToDiffrenceIncome = By.xpath("//textarea[contains(@aria-label,'different than this')]");
	By enterEmployerNameS069 = By
			.xpath("//span[contains(text(),'Employer name')]//..//..//following-sibling::div//input");
	By enterOtherRace = By.xpath("//input[contains(@aria-label,'Other:')]");
	By clickContinueApplication = By.xpath("//a[contains(text(),'Continue Application')]");
	By selectStateAgent = By.xpath("//select[@id='State']");
	By clickApplyOrRenewAgent = By.xpath("//button[contains(text(),'APPLY OR RENEW')]");
	
	By enterFirstNameAgent = By.xpath("//input[@id='FirstNameTelephone']");
	By enterLastNameAgent = By.xpath("//input[@id='LastNameTelephone']");
	By enterDobAgent = By.xpath("(//input[@class='form-control calendarIcon ng-untouched ng-pristine ng-invalid flatpickr-input form-control input w-95 datepicker masked'])[2]");
	By clickContinueAgent = By.xpath("//button[@id='btnContinueTelephone']");
	By clickContinueApplicationAgent = By.xpath("//a[contains(text(),'CONTINUE APPLICATION')]");
	By enterAptcAmount = By.xpath("//input[@id='APTCamount']");
	By applicationYear=By.xpath("//select[@id='year']");
	By getYear=By.xpath("//select[@id='year']//option");
	By employerNameCobra_S069=By.xpath("//span[contains(text(),'Employer name')]/../..//following-sibling::div//input");
	By selectRelationS28_Item92=By.xpath("(//span//..//..//..//select[@class='form-control'])[1]");
	
	
	

	// text verification
	By mailingDrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By mailingDrawerHeader = By.xpath("//h1[@class='head']");
	By s003Question = By.xpath("//span[contains(text(),'mailing address?')]");
	By s003DrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s001Question = By.xpath("(//h5[@class='sv_q_title'])[1]//span");
	By s002Question = By.xpath("//h5[@class='sq-simple-title']//span");
	By s004Question = By.xpath("//div[@class='sv_p_container']//h4//span[contains(@style,'position')]");
	By s005Question = By.xpath("//div[@class='sv_q_title']");
	By s005QuestionExplaination = By
			.xpath("//div[@class='sv_q_title']//..//following-sibling::div[@class='sv_q_description']");
	By s005OpenDrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s005DrawerHeading = By.xpath("//div[@class='head']");
	By s005DrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s006Question = By.xpath("//h5[@class='sv_q_title']//span");
	By s007Question = By.xpath("//span[contains(text(),'Is a professional helping you complete your application')]");
	By s007OpenDrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s007DrawerHeading = By.xpath("//div[@class='head']");
	By s007DrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s008Question = By.xpath("//span[contains(text(),'help paying for health coverage?')]");
	By s010MedicareDrawerLink = By.xpath("(//a[contains(@onclick,'OpenDrawer')])[1]");
	By s010NotIncludeDrawerLink = By.xpath("(//a[contains(@onclick,'OpenDrawer')])[2]");
	By s010EditOrRemoveDrawerLink = By.xpath("(//a[contains(@onclick,'OpenDrawer')])[3]");
	By s010MedicareDrawerHeading = By.xpath("//div[@class='head']");
	By s010NotIncludeDrawerHeading = By.xpath("//h1[@class='head']");
	By s010EditOrRemoveDrawerHeading = By.xpath("(//div[@class='head'])[1]");
	By s010MedicareDrawerContent = By.xpath("//div[@class='mCustomScrollBox mCS-light mCSB_vertical mCSB_inside']");
	By s010NotIncludeDrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s010EditOrRemoveDrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By so12Question = By.xpath("//div[@class='sv_q_title']");
	By s012SameNameQuestion = By.xpath("//span[contains(text(),'same name')]");
	By s014Question = By.xpath("//span[contains(text(),'national')]");
	By s014OpenDrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s014DrawerHeading = By.xpath("//div[@class='head']");
	By s014DrawerContent = By.xpath("//div[@class='mCSB_container']");
	By s017Question = By.xpath("//span//span[contains(text(),'naturalized or derived citizen')]");
	By s017OpenDrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s017DrawerHeading = By.xpath("//div[@class='head']");
	By s017DrawerContent = By.xpath("//div[@class='mCSB_container mCS_y_hidden mCS_no_scrollbar_y']");
	By s017DocumentQuestion = By.xpath("//span[contains(text(),'documents')]");
	By s017DocumentDrawerHeading = By.xpath("//h1[@class='head']");
	By s017DocumentDrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s017DocumentOpenDrawerLink = By.xpath("//a[contains(text(),'these document')]");
	By s017DocumentSubQuestion = By.xpath("//div[@class='sv_p_container']//span[contains(text(),'citizenship')]");
	By s017DocumentSubDrawerHeading = By.xpath("//div[@class='head']");
	By s017DocumentSubDrawerContent = By.xpath("//div[@class='content mCustomScrollbar _mCS_1']");
	By s017DocumentSubOpenDrawerLink = By.xpath("//a[contains(text(),'document number')]");
	By s050AQuestion = By.xpath("//span[contains(text(),'situations ')]");
	By s069DQuestion = By.xpath("//span[contains(text(),'Qualified Small Employer Health Reimbursement Arrangement')]");
	By s069DDrawerHeading = By.xpath("//h1[@class='head']");
	By s069DDrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s083Question = By.xpath("//span[contains(text(),'Did any of these people lose qualifying health coverage')]");
	By s083OpenDrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s083DrawerHeading = By.xpath("//h1[@class='head draggabledivheader']");
	By s083DrawerContent = By.xpath("//div[@class='mCSB_container']");
	By s085Question = By.xpath("//div[contains(@data-bind,'title')]//span");
	By s084Question = By.xpath("//span[contains(text(),'Will any of these people lose qualifying health coverage')]");
	By s084OpenDrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s084DrawerHeading = By.xpath("//h1[@class='head draggabledivheader']");
	By reviewDrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By reviewDrawerHeading = By.xpath("//h1[@class='head draggabledivheader']");
	By reviewDrawerContent = By.xpath("//div[@class='mCSB_container mCS_y_hidden mCS_no_scrollbar_y']");
	By appID = By.xpath("//div[@class='appID text-center ng-star-inserted']");
	By s010AQuestion = By.xpath("//span[contains(text(),'change')]");
	By s010ADrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s010ADrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s010ADrawerHeading = By.xpath("//div[@class='head']");
	By s026Question = By.xpath("//span[contains(text(),'marital ')]");
	By s026DrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s026DrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s026DrawerHeading = By.xpath("//h1[@class='head']");
	By s027Question = By.xpath("//h5[contains(@data-bind,'title')]//span[contains(text(),'income tax')]");
	By s027QuestionSingle2 = By.xpath("(//h5[contains(@data-bind,'title')]//span[contains(text(),'income tax')])[2]");
	By s027DrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s027DrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s027DrawerHeading = By.xpath("//h1[@class='head']");
	By s027QuestionDependent = By.xpath("//span[contains(text(),'claim any dependents on')]");
	By s027QuestionDependent3 = By.xpath("(//h5[contains(@data-bind,'title')]//span)[3]");
	By s027DrawerLinkDependent = By.xpath("(//a[contains(@onclick,'OpenDrawer')])[2]");
	By s027DrawerContentDependent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s027DrawerHeadingDependent = By.xpath("//h1[@class='head']");
	By s041AQuestion = By.xpath("//h5[contains(@data-bind,'title')]//span[contains(text(),'live together')]");
	By s041ADrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s041ADrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s041ADrawerHeading = By.xpath("//h1[@class='head']");
	By s038Question = By.xpath("//span[contains(text(),'take care')]");
	By s046Question = By.xpath("//span[contains(text(),'Medicaid')]");
	By s046DrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s046DrawerHeading = By.xpath("//h1[@class='head']");
	By s046DrawerContent = By.xpath("//div[@class='content mCustomScrollbar']");
	By s049Question1 = By.xpath("(//span[contains(text(),'Medicaid')])[1]");
	By s049Question2 = By.xpath("(//span[contains(text(),'Medicaid')])[2]");
	By s053DrawerLink = By.xpath("//a[contains(@onclick,'OpenDrawer')]");
	By s053Question = By.xpath("//span[contains(text(),'people are pregnant')]");
	By s053DrawerHeading = By.xpath("//h1[@class='head draggabledivheader']");
	By s053DrawerContent = By.xpath("//div[@class='content mCustomScrollbar _mCS_1']");
	By s053Question2 = By.xpath("//span[contains(text(),'expecting')]");
	By selectBabyCount = By.xpath("//select[@class='form-control']");
	By s057Question = By.xpath("//span[contains(text(),'income this month')]");
	By selectJobType = By.xpath("//select[@class='form-control']");
	By enterEmployerName = By.xpath("//span[contains(text(),'Employer name')]/../..//following-sibling::div//input");
	By s057Question2 = By.xpath("//span[contains(text(),'currently gets this month.')]");
	By enterIncomeAmount = By.xpath("//input[contains(@inputmode,'numeric')]");
	By s057Question3 = By.xpath("//span[contains(text(),'get this income')]");
	By s057Question4 = By.xpath("//div[contains(text(),'Enter the amount')]");
	By s058Question = By.xpath("//span[contains(text(),'educator expense')]");
	By yearlyIncome = By.xpath("(//span[@class='money'])[2]");
	By monthlyIncome = By.xpath("(//span[@class='money'])[1]");
	By s068Question = By.xpath("//span[contains(text(),'currently enrolled')]");
	By s082Question = By.xpath("//span[contains(text(),' plan through a job')]");
	By s069AQuestion = By.xpath(
			"//span[contains(text(),' individual coverage Health Reimbursement Arrangement (HRA) through their job')]");
	By s069BQuestion = By.xpath("//span[contains(text(),'yet accepted through their job')]");
	By s070Question = By.xpath("//span[contains(text(),'Tell us about coverage offers that apply to them starting')]");
	By s074Question = By.xpath("//span[contains(text(),'Tell us more about')]");
	By s090Question = By.xpath("//span[contains(text(),'recently get married?')]");
	By enterDate = By.xpath("//input[@class='form-control flatpickr-input form-control input w-95 datepicker masked']");
	By enterDateOnSamePage = By
			.xpath("//input[@class='form-control flatpickr-input form-control input w-95 datepicker masked']");
	By enterDateP1 = By
			.xpath("(//input[@class='form-control flatpickr-input form-control input w-95 datepicker masked'])[1]");
	By enterDateP2 = By
			.xpath("(//input[@class='form-control flatpickr-input form-control input w-95 datepicker masked'])[2]");
	By enterDateP3 = By
			.xpath("(//input[@class='form-control flatpickr-input form-control input w-95 datepicker masked'])[3]");
	By s090Question2 = By.xpath("//span[contains(text(),'When did')]");
	By s090Question3 = By.xpath("//span[contains(text(),'qualifying health coverage')]");
	By s030Question = By.xpath("//span[contains(text(),'another parent')]");
	By s045Question = By.xpath("//span[contains(text(),'physical disability')]");
	By s045Question2 = By.xpath("//span[contains(text(),'daily activities')]");
	By s051Question = By.xpath("//span[contains(text(),'considered ')]//..//parent::div//h5//span");
	By s051Question2 = By.xpath("//span[contains(text(),'guardians')]");
	By s019Question = By.xpath("//h5//span[contains(text(),'immigration status')]");
	By s019Question2 = By.xpath("//span[contains(text(),'current documentation and status')]");
	By s027QuestionSomeOneElseTaxReturn = By.xpath("//span[contains(text(),'someone else')]");
	By s050Question = By.xpath("//span[contains(text(),'on their immigration status')]");
	By s044Question1 = By.xpath(
			"//span[contains(text(),'Are any of these people an honorable discharged veteran or active duty member of the military? ')]");
	By s044Question2 = By.xpath(
			"//span[contains(text(),'Do any of these people have a deceased spouse who was an honorable discharged veteran or active duty member of the military? ')]");
	By s094Question = By.xpath("//span[contains(text(),'Which of these people are incarcerated?')]");
	By s088Question = By.xpath("//span[contains(text(),'Did any of these people move in the past 60 days?')]");
	By s088DateErrorMessage = By.xpath("//span[contains(@data-bind,'css: question.koCss().error.item')]//span");
	By s054Question = By.xpath("//span[contains(text(),'Were any of these people ever in foster care?')]");
	By s052Question = By.xpath("//h5//span[contains(text(),'American Indians or Alaskan Natives')]");
	By s075Question = By.xpath("//h5//span[contains(text(),'federally recognized tribe')]");
	By s075Question2 = By.xpath("//h5//span[contains(text(),'tribe located')]");
	By s064Question = By.xpath("//h5[@class='sq-simple-title']//span");
	By s081Question = By.xpath("//span[contains(text(),'coverage through a job that ended')]");
	By s069CQuestion = By.xpath("//span[contains(text(),'be able to use this HRA')]");
	By s069CQuestion2 = By.xpath("//span[contains(text(),'Which employers offer')]");
	By s069EQuestion = By.xpath("//span[contains(text(),'Tell us about the ICHRA offered by')]");
	By s041AQuestion2 = By.xpath("//span[contains(text(),'Select everyone who lives at this')]");
	By s086Question = By.xpath("//span[contains(text(),'people recently gain eligible immigration status')]");
	By s010BQuestion = By.xpath("//span[contains(text(),'or keep him on the application')]");
	By s042Question = By.xpath("//span[contains(text(),'living outside')]");
	By s042Question2 = By.xpath("//span[contains(text(),'home address?')]");
	By s042Question3 = By.xpath("//div[contains(text(),'live in')]");
	By s024Question = By.xpath("//span[contains(text(),'lived in the U.S.')]");
	By s071Question = By.xpath("//span[contains(text(),'Select all that apply.')]");
	By s072Question = By.xpath("//span[contains(text(),'Do you want to add another employer?')]");
	By s073Question = By.xpath("//span[contains(text(),'health plan that meets the minimum value standard?')]");
	By s079Question = By.xpath(
			"//span//span[contains(text(),'Do any of the children below have a parent living outside the home?')]");
	By s067Question = By.xpath(
			"//span[contains(text(),'Have any of these people gotten, or been approved to get, unemployment compensation for 2021?')]");
	By s063Question = By.xpath("//span[contains(text(),'different than this')]");
	By s003Question2 = By.xpath("//div[@class='sv_q_title']");
	By invalidSsnError = By.xpath("//span[contains(text(),'valid social security number')]");
	By i94Number = By.xpath("//input[contains(@aria-label,'I-94')]");
	By hoursForP1 = By.xpath("(//input[contains(@aria-label,'I-94')])[1]");
	By hoursForP2 = By.xpath("(//input[contains(@aria-label,'I-94')])[2]");
	By s80Question = By.xpath("//div[contains(text(),'parents work?')]");
	
	

	// After Eligibility
	By continueButton = By.xpath("//button[contains(text(),'CONTINUE')]");
	By clickViewPlans = By.xpath("//button[contains(text(),'VIEW PLANS')]");
	By agreeCheckBox = By.xpath("//label[contains(text(),'I agree')]");
	By goBackToHomeButton = By.xpath("//input[@value='Go BACK TO HOME']");

	// continue button
	// save and continue
	// slect all from lower premium
	// save and continue
	// click view plan
	// select plan(Envision - Silver 400 CSR)
	// click enroll button
	// save and continue
	// select i agree
	// save and continue
	// wait on go back to home button for screenshot

}
