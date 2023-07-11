**Cluster Monitor** [[GitHub](https://github.com/OneHoax/data_engineering/tree/master/linux_sql)]: 

Developed a monitoring agent to keep track of a cluster's resources and usage across time; this provided the team invaluable information about decisions to scale the cluster (and each node in it) up or down. The project was implemented with Bash, PostgreSQL, and Docker.

**Core Java Apps** [[GitHub](https://github.com/OneHoax/data_engineering/tree/master/core_java)]:
      
  - Grep App: Searches for a text pattern recursively in a given directory and outputs matched lines to a file - implemented with Java 8 Streams.
  - JDBC App: Performs fundamental CRUD operations using the DAO pattern as an abstraction layer with DTOs as the actual objects encapsulating data to and from the data source.
  - Twitter App: Posts/shows/deletes Twitter posts via the Twitter REST API - designed with the well-known MVC (minus V) architecture.

**SpringBoot App** [[GitHub](https://github.com/OneHoax/data_engineering/tree/master/springboot)]: 

Developed a RESTful API using SpringBoot that simulates an online stock trading system; it retrieves stock market data from IEX Cloud and persists it into a PostgreSQL instance; this data can then be used to CRUD quote, trader, and order data against the database. This API can be consumed by front-end and mobile developers, as well as traders. The application is implemented as a microservice using SpringBoot (to manage dependencies and provide the web-server), PostgreSQL (to persist and CRUD data using DAO), and IEX Cloud (as the stock market data source); it also falls under the MVC and 3-tier architecture - it has a client tier (HTTP clients to consume API), an application tier (SpringBoot Java program which processes data), and a data tier (where data is persisted).

**Data Analytics** [[GitHub](https://github.com/OneHoax/data_engineering/tree/master/python_data_wrangling)]: 

Implemented a data analysis project to help a retail organization drive their revenue back up; specifically, the analysis segmented customers (using RFM Segmentation) into important categories to help the company develop targeted marketing strategies. Used a PostgreSQL instance as a data warehouse and Python Pandas/Jupyter to perform OLAP operations on the data and answer necessary business questions.

**Hadoop** [[GitHub](https://github.com/OneHoax/data_engineering/tree/master/hadoop)]: 

Evaluated Hadoop core components (HDFS, YARN, and MapReduce), deployed a 3-node Hadoop cluster using Google Cloud Platform Dataproc, and performed data processing/analytics using Hive and Zeppelin; leveraged the distributed storage and processing capabilities of the Hadoop ecosystem to examine the 2016 World Development Indicators dataset, optimize it, and ultimately do analytical operations on it.

**Spark** [[GitHub](https://github.com/OneHoax/data_engineering/tree/master/spark)]: 

Evaluated Spark's functionality and performance with Zeppelin on Hadoop and re-implemented the [Data Analytics project](https://github.com/OneHoax/data_engineering/tree/master/python_data_wrangling) using Azure Databricks and Spark Structured APIs; performed parallel data analytics on a cluster against customer transactional data to answer several business questions and identify important customer categories to help the client organization develop targeted marketing strategies.

**Cloud/DevOps** [[GitHub](https://github.com/OneHoax/data_engineering/tree/master/cloud_devops)]: 

Deployed the [SpringBoot App](https://github.com/OneHoax/data_engineering/tree/master/springboot) to the Azure Cloud; used Azure Kubernetes Service to create 2 identical Kubernetes clusters to serve as development and production environments; deployed the application, scaled it out/in as needed, and exposed it to the outside world by using the Kubernetes API; used Azure Container Registry to build/store Docker images for better integration with Azure services; ultimately, automated the integration and deployment process by developing CI/CD pipelines for each of the environments using Jenkins.
