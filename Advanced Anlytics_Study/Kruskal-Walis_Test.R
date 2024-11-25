#Kruskal-Walis Test
One_Way_Anova_CBSE <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-8_ANOVAs/One Way ANOVA/One_Way_Anova_ CBSE.xlsx")
attach(One_Way_Anova_CBSE)
shapiro.test(Marks)

kw=kruskal.test(Marks~Graduation_Stream,One_Way_Anova_CBSE)
kw