#Exploratory Factor Analysis
library(readxl)
 Factor_Analysis_Delta_Cars <- read_excel("C:/Users/dbda/Downloads/Advanced Analytics Using Statistics-20241028T050433Z-001/Advanced Analytics Using Statistics/Advance Analytics-2024/Day-11_EFA & Cluster Analysis/EFA/Factor Analysis_Delta Cars.xlsx")
attach(Factor_Analysis_Delta_Cars)
r=cor(Factor_Analysis_Delta_Cars)
r
library(psych)

# assumptions
str(Factor_Analysis_Delta_Cars)
KMO(r)
cortest.bartlett(r)
library(REdaS)
KMOS(Factor_Analysis_Delta_Cars)
bart_spher(Factor_Analysis_Delta_Cars)

#Explotary factor analysis
scree(Factor_Analysis_Delta_Cars)
#Eigen values 
pca(r,nfactors = 10,rotate = F)
z=pca(r,nfactors = 3,method = regression,rotate = "varimax",scores = T)
z
print(z$loadings,digits = 3,cutoff = 0.7)
