# Disaster Alarm Backend Application Design Document

## Overview

This document outlines the design for a disaster alarm backend application using Spring Boot microservices. The application will handle disaster alarm creation, notification, and management in a scalable and resilient manner.

## Architecture

The system will consist of the following microservices:

1. **Alarm Service**: Handles creation, updating, and deletion of disaster alarms.
2. **Notification Service**: Manages notifications for disaster alarms (e.g., sending emails, SMS).
3. **User Service**: Manages user information and preferences.
4. **Gateway Service**: Acts as an entry point to route requests to appropriate services.
5. **Discovery Service**: Service registry to enable service discovery (e.g., Eureka).
6. **Configuration Service**: Centralized configuration management (e.g., Spring Cloud Config).
7. **Logging and Monitoring Service**: Collects and monitors logs and metrics.

### Technologies

- **Spring Boot**: For building microservices.
- **Spring Cloud**: For cloud-native architecture components.
- **Eureka**: For service discovery.
- **Spring Cloud Gateway**: For API gateway.
- **Spring Cloud Config**: For centralized configuration management.
- **Hystrix**: For circuit breaker pattern.
- **Kafka**: For message brokering (optional, for asynchronous communication).
- **Prometheus and Grafana**: For monitoring and alerting.

## Services

### 1. Gateway Service

- **Responsibilities**:
  - Route incoming requests to appropriate services.
  - Perform request validation and logging.

### 2. Discovery Service

- **Responsibilities**:
  - Service registration and discovery.
  - Provide information about available services and instances.
