require 'pusher'

from    = ARGV[0]
message = ARGV[1]

Pusher.url = "http://59cb3ed47c36fd6c1558:5676954feac2e1705bd9@api.pusherapp.com/apps/11369"

Pusher['test_channel'].trigger('my_event', {
    message: message,
    from: from
})

