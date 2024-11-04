#Lab2 Two way ANOVA
Two_way_ANOVA <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Lab-2-Cases/Two way  ANOVA.xlsx")
attach(Two_way_ANOVA)

str(Two_way_ANOVA)
Two_way_ANOVA$`Attendance level in %` <- as.factor(Two_way_ANOVA$`Attendance level in %`)
Two_way_ANOVA$`Educational Background` <- as.factor(Two_way_ANOVA$`Educational Background`)
str(Two_way_ANOVA)

#Normality
shapiro.test(`Academic Scores`)

#Homogenity
library(car)
leveneTest(`Academic Scores`~`Attendance level in %`, data = Two_way_ANOVA)
leveneTest(`Academic Scores`~`Educational Background`, data = Two_way_ANOVA)

#ANOVA
Model <- aov(`Academic Scores`~`Attendance level in %`*`Educational Background`, data = Two_way_ANOVA)
summary(Model)

#Tukey Test
TukeyHSD(Model)

#Normality
shapiro.test(Model$residuals)
