workflow "Pull Request notification" {
  resolves = ["GitHub Action for Slack"]
  on = "pull_request"
}

action "GitHub Action for Slack" {
  uses = "Ilshidur/action-slack@d8660fe30331a4a28b1019c7fe429dc9b6c1276e"
  secrets = ["SLACK_WEBHOOK", "GITHUB_TOKEN"]
  args = "A new pull request has been pushed to MarkL4YG/confort"
}
