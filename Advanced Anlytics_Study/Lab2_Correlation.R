#Lab2 Correlation
Correlation_Analsyis <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Lab-2-Cases/Correlation Analsyis.xlsx")
attach(Correlation_Analsyis)

str(Correlation_Analsyis)

#Normality
shapiro.test(`General Knowledge`)
shapiro.test(`College Examination Marks`)

#Linearity $ Outliers
plot(`General Knowledge`,`College Examination Marks`)
boxplot(`General Knowledge`)
boxplot(`College Examination Marks`)

#Correlation
cor.test(`General Knowledge`,`College Examination Marks`)
