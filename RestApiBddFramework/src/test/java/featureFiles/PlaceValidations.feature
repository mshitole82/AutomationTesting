Feature: To Validate AddPlaceAPI

Scenario: Verify if Place is being Successfully added using AddPlaceAPI
Given Add Place API Payload
When user calls "AddPlaceAPI" with Post http request
Then the API call got success with status code 200
And "status" in response body is1 "OK"
And "scope" will be  in response body is "APP"